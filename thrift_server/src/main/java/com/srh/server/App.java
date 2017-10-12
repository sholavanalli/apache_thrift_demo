package com.srh.server;

import com.srh.server.generated.ThriftQueryRemote;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;

public class App {

    public static ThriftQueryImpl handler;

    public static ThriftQueryRemote.Processor processor;

    public static void main(String [] args) {
        try {
            handler = new ThriftQueryImpl();
            processor = new ThriftQueryRemote.Processor(handler);

            Runnable simple = () -> simple(processor);

            new Thread(simple).start();
        } catch (Exception x) {
            x.printStackTrace();
        }
    }

    public static void simple(ThriftQueryRemote.Processor processor) {
        try {
            TServerTransport serverTransport = new TServerSocket(9090);
            TServer server = new TSimpleServer(new TServer.Args(serverTransport).processor(processor));

            // Use this for a multithreaded server
            // TServer server = new TThreadPoolServer(new TThreadPoolServer.Args(serverTransport).processor(processor));

            System.out.println("Starting the simple server...");
            server.serve();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

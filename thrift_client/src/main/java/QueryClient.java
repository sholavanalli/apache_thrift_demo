import com.srh.server.QueryResult;
import com.srh.server.generated.ThriftQueryRemote;
import com.srh.server.generated.ThriftQueryResult;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

public class QueryClient {

    public QueryResult runQuery() {
        QueryResult res = null;
        try {
            TTransport transport;
            transport = new TSocket("localhost", 9090);
            transport.open();
            TProtocol protocol = new TBinaryProtocol(transport);
            ThriftQueryRemote.Client client = new ThriftQueryRemote.Client(protocol);

            ThriftQueryResult thriftQueryResult = client.runQuery("name:*", 100, 10);
            res = QueryResult.getFromThrift(thriftQueryResult);

            transport.close();
        } catch (TException x) {
            x.printStackTrace();
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.print(new QueryClient().runQuery().toString());
    }
}

namespace java com.srh.server.generated

exception ThriftQueryException {
  1: optional string message
}

enum ThriftQueryType {
  INTEGRATION = 1,
  OBJECT_TYPE = 2
}

struct ThriftQueryOutputRecord {
  1: optional i64 id,
  2: optional string name
}

struct ThriftQueryResult {
  1: optional i64 totalHits,
  2: optional i32 limit,
  3: optional i32 offset,
  4: optional ThriftQueryType queryType,
  5: optional list<ThriftQueryOutputRecord> records
  6: optional string aggType = "avg" # added in v2.0
}

service ThriftQueryRemote {
   # aggType added in v2.0
   ThriftQueryResult runQuery(1: string expression, 2: i32 limit, 3: i32 offset, 4: string aggType = "avg") throws (1: ThriftQueryException tqe)
}
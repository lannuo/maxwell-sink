package com.cimc.maxwell.sink.row;

import com.alibaba.fastjson.JSON;

import java.util.Map;

/**
 * Created by 00013708 on 2017/8/7.
 */
public class RowMap {

    private String database;

    private String table;

    private String type;

    private Long ts;

    private String sql;

    private Long xid;

    private Boolean commit;

    private Map<String, String> data;

    private Map<String, String> old;

//    private Map<String, String> def;


    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getTs() {
        return ts;
    }

    public void setTs(Long ts) {
        this.ts = ts;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public Long getXid() {
        return xid;
    }

    public void setXid(Long xid) {
        this.xid = xid;
    }

    public Boolean getCommit() {
        return commit;
    }

    public void setCommit(Boolean commit) {
        this.commit = commit;
    }


    public Map<String, String> getData() {
        return data;
    }

    public void setData(Map<String, String> data) {
        this.data = data;
    }

    public Map<String, String> getOld() {
        return old;
    }

    public void setOld(Map<String, String> old) {
        this.old = old;
    }

//    public Map<String, String> getDef() {
//        return def;
//    }
//
//    public void setDef(Map<String, String> def) {
//        this.def = def;
//    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}

package cn.vpclub.pinganquan.report.collector.dto;


public class RpcResult {

    private int code;

    private String message;

    private Object data;

    public int getCode() {
        return code;
    }

    public RpcResult(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

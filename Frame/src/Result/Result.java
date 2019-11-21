package Result;

public class Result {
    private int resultcode;
    private String resultmessage;

    public Result(int resultcode, String resultmessage) {
        this.resultcode = resultcode;
        this.resultmessage = resultmessage;
    }
    public String getResultmessage() {
        return resultmessage;
    }
    public int getResultcode() {
        return resultcode;
    }
    public void setResultcode(int resultcode) {
        this.resultcode = resultcode;
    }
    public void setResultmessage(String resultmessage) {
        this.resultmessage = resultmessage;
    }
}

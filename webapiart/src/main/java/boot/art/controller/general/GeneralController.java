package boot.art.controller.general;


/**
 * Created by shaofeng on 2017/9/12.
 */
public class GeneralController {

    public Message setOkMsg(Object data){
        Message msg=new Message();
        msg.setCode(1);
        msg.setData(data);
        msg.setMsg(null);
        return msg;
    }

    public Message setOkMsg(Object data,String msg){
        Message message=new Message();
        message.setCode(1);
        message.setMsg(msg);
        message.setData(data);
        return message;
    }

    public Message setErrorMsg(Object data){
        Message message=new Message();
        message.setCode(0);
        message.setData(data);
        message.setMsg(null);
        return message;
    }

    public Message setErrorMsg(Object data,String msg){
        Message message=new Message();
        message.setCode(0);
        message.setData(data);
        message.setMsg(msg);
        return message;
    }

    public static class Message{

        private int code;

        private String msg;

        private Object data;

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }
    }
}

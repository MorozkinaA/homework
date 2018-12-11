package com.netcracker;
import javax.servlet.http.HttpServletRequest;


public class EmailParameters {
    private String toEmail;
    private String copy;
    private String subject;
    private String text;
    private String fromEmail = "example_sender@abc.com";
    private String host = "127.0.0.1";

    public EmailParameters(HttpServletRequest req) {
        this.toEmail = req.getParameter("email");
        this.copy = req.getParameter("copy");
        this.subject = req.getParameter("subject");
        this.text = req.getParameter("text");
    }

    public String getToEmail() {
        return toEmail;
    }

    public String getFromEmail() {
        return fromEmail;
    }

    public String getHost() {
        return host;
    }

    public String getCopy() {
        return copy;
    }

    public String getSubject() {
        return subject;
    }

    public String getText() {
        return text;
    }

    public boolean validation() {
        if(toEmail.matches(" \"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@\"\n" +
                            "+ \"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$\"")){
            return true;
        }
        if(copy.matches(" \"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@\"\n" +
                "+ \"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$\"")){
            return true;
        }
        if("".equals(text)) {
            return false;
        }
        return false;
    }
}

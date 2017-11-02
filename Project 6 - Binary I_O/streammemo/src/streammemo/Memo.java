/*Purpose: This program to create/read a memo objects
 Inputs: This program ask for an topic and message inputs
 Output: Read/create an memo objects.
 */
package streammemo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Adrian
 */
public class Memo implements Serializable {

    String topic;
    String message;
    Date date;

    public Memo(String topic, String msg) {
        this.topic = topic;
        this.message = msg;
        date = new Date();

    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setMessage(String msg) {
        this.message = msg;
    }

    public String getTopic() {
        return topic;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return this.topic + "\n" + date.toString() + "\n" + this.message;
    }

}

package chap_8.duplicate_observed_data;

import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.Observable;
import java.util.Observer;

public class IntervalWindow extends Frame implements Observer {
    private TextField startField;
    private TextField endField;
    private TextField lengthField;
    private Interval subject;


    public void update(Observable o, Object arg) {
        endField.setText(subject.getEnd());
        startField.setText(subject.getStart());
        lengthField.setText(subject.getLength());
    }

    class SysFocus extends FocusAdapter {
        public void focusLost(FocusEvent event) {
            Object object = event.getSource();
            if (object == startField) {
                StartField_FocusLost(event);
            } else if (object == endField) {
                EndField_FocusLost(event);
            } else if (object == lengthField) {
                LengthField_FocusLost(event);
            }
        }

        void StartField_FocusLost(FocusEvent event) {
            setStart(startField.getText());
            if (isNotInteger(getStart())) {
                setStart("0");
            }
            subject.calculateLength();
        }

        void EndField_FocusLost(FocusEvent event) {
            setEnd(endField.getText());
            if (isNotInteger(getEnd())) {
                setEnd("0");
            }
            subject.calculateLength();
        }

        void LengthField_FocusLost(FocusEvent event) {
            setLength(lengthField.getText());
            if (isNotInteger(getLength())) {
                setLength("0");
            }
            subject.calculateEnd();
        }

        boolean isNotInteger(String value) {
            try {
                Integer.parseInt(value);
            } catch (NumberFormatException e) {
                return true;
            }
            return false;
        }
    }

    public String getStart() {
        return subject.getStart();
    }

    public void setStart(String value) {
        subject.setStart(value);
    }

    public String getEnd() {
        return subject.getEnd();
    }

    public void setEnd(String value) {
        subject.setEnd(value);
    }

    public String getLength() {
        return subject.getLength();
    }

    public void setLength(String value) {
        subject.setLength(value);
    }
}

class Interval extends Observable {
    private String start = "0";
    private String end = "0";
    private String length = "0";

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
        setChanged();
        notifyObservers();
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
        setChanged();
        notifyObservers();
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
        setChanged();
        notifyObservers();
    }

    void calculateLength() {
        try {
            int start = Integer.parseInt(getStart());
            int end = Integer.parseInt(getEnd());
            int length = end - start;

            setLength(String.valueOf(length));
        } catch (NumberFormatException e) {
            throw new RuntimeException("Unexpected number format error");
        }
    }

    void calculateEnd() {
        try {
            int start = Integer.parseInt(getStart());
            int length = Integer.parseInt(getLength());
            int end = start + length;
            setEnd(String.valueOf(end));
        } catch (NumberFormatException e) {
            throw new RuntimeException("Unexpected number format error");
        }
    }
}

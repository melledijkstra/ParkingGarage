package parkinggarage.views.control;

import javafx.scene.control.TextField;
/**
 * Created by Bjorn on 2/1/2017.
 */
public class RestrictiveTextField extends TextField {

    @Override
    public void replaceText(int start, int end, String text)
    {

        if (validate(text))
        {
            super.replaceText(start, end, text);
        }
    }

    @Override
    public void replaceSelection(String text)
    {
        if (validate(text))
        {
            super.replaceSelection(text);
        }
    }

    private boolean validate(String text)
    {
        return text.matches("[0-9.]*");
    }
}

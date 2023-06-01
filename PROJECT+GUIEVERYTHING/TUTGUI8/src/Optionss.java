import javax.swing.JOptionPane;

public class Optionss {

    public static void main(String[] args) {
        
        //JOptionPane = pops up a standard dialog box that prompts the user for a value or informs them about something.

        JOptionPane.showMessageDialog(null, "So many options!", "Option window", JOptionPane.QUESTION_MESSAGE); 
        //they take different arguments, we set the parent component to null, usually
        //and then the message in the joptionpane,
        //then the title of the window
        //finally, the message type; of whiche there are 5:plain message, information message, question message, warning message, and finally, an error message
        //can put the joptionpane in a forever while loop to make sure that closing it always makes it reopen (annoying, but you know how at least)

        //a different type of pop up joptionpane is one that allows users to input yes/no or cancel
        JOptionPane.showConfirmDialog(null, "Pick one!", "what a window, damn", JOptionPane.YES_NO_CANCEL_OPTION); 
        //same as before, the joptionpane. part just takes sth new, like yes, yesno, yesnocancel options for the user to choose from
        //from the yesnocancel options, yes returns an integer 0, no returns 1, and cancel returns 2, closing the window returns -1.

        //so one thing we could do, is store the output from this dialog prompt into an integer variable, and based on that value, we can cause other actions to happen, with conditional statements or switches.

        //another type is the showinputdialog joptionpane window, which allows us to take input from the user and then store it in a string.
        String name = JOptionPane.showInputDialog("what's your name?"); 
        System.out.println("Hello" + name); //displays the name stored

        //Finally, we have the showOptionDialog, which can create an option window with custom buttons.
        String[] optionButtons = {"damn", "let's go", "mario"};
                                //the yes button is the first string, the no button is the second string, and mario is the third
                                //so instead of yes no cancel,
                                //you get damn, let's go, and mario
                                //but since in macs it's displayed the other way around, like cancel, no, yes
                                //we actually see mario, let's go, and damn
        JOptionPane.showOptionDialog(null, "you're kinda awesome!", "cool window", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, optionButtons, 0);
        /*
        so, this one has a lot of arguments, and breaking it down, we have:
                                    1: the parent component (usually always null)
                                                        2: the message to be displayed in the window.
                                                                                            3: the title of the option window
                                                                                                                4: the options type for the number of buttons
                                                                                                                                                    5: the kind of option window you want it to be.
                                                                                                                                                                                    6: the icon of the popup window, set to null, but you can make an imageicon and set it to that.
                                                                                                                                                                                            7: finally, the custom options, for which we will have to create a custom array of strings, which we'll just put here

        */

    }
}
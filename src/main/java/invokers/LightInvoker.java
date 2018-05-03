package invokers;

import commands.ICommand;

public class LightInvoker {
    private ICommand lightOnCommand;
    private ICommand lightOffCommand;
    private ICommand lightDimUpCommand;
    private ICommand lightDimDownCommand;

    public LightInvoker(ICommand lightOnCommand, ICommand lightOffCommand, ICommand lightDimUpCommand, ICommand lightDimDownCommand) {
        this.lightOnCommand = lightOnCommand;
        this.lightOffCommand = lightOffCommand;
        this.lightDimUpCommand = lightDimUpCommand;
        this.lightDimDownCommand = lightDimDownCommand;
    }

    public void clickOn() {
        this.lightOnCommand.execute();
    }
    public void undoClickOn() {
        this.lightOnCommand.unexecute();
    }

    public void clickOff() {
        this.lightOffCommand.execute();
    }
    public void undoClickOff() {
        this.lightOffCommand.unexecute();
    }

    public void clickDimUp() {
        this.lightDimUpCommand.execute();
    }
    public void undoClickDimUp() {
        this.lightDimUpCommand.unexecute();
    }

    public void clickDimDown() {
        this.lightDimDownCommand.execute();
    }
    public void undoClickDimDown() {
        this.lightDimDownCommand.unexecute();
    }
}

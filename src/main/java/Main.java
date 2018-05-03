import commands.LightDimDownCommand;
import commands.LightDimUpCommand;
import commands.LightOffCommand;
import commands.LightOnCommand;
import invokers.LightInvoker;
import receivers.Light;

public class Main {
    public static void main(String[] args) {
        Light someLight = new Light();

        LightInvoker lightInvoker = new LightInvoker(new LightOnCommand(someLight), new LightOffCommand(someLight), new LightDimUpCommand(someLight), new LightDimDownCommand(someLight));

        lightInvoker.clickOn();
        lightInvoker.undoClickOn();

        lightInvoker.clickOff();
        lightInvoker.undoClickOff();

        lightInvoker.clickDimUp();
        lightInvoker.undoClickDimUp();

        lightInvoker.clickDimDown();
        lightInvoker.undoClickDimDown();
    }
}

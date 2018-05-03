package commands;

import receivers.Light;

public class LightDimUpCommand implements ICommand {
    private Light light;

    public LightDimUpCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.dimUp();
    }

    @Override
    public void unexecute() {
        this.light.dimDown();
    }
}

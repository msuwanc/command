package commands;

import receivers.Light;

public class LightDimDownCommand implements ICommand {
    private Light light;

    public LightDimDownCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.dimDown();
    }

    @Override
    public void unexecute() {
        this.light.dimUp();
    }
}

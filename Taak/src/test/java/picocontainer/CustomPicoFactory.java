package picocontainer;

import actions.UIDriverActions;
import actions.UITodoActions;
import io.cucumber.picocontainer.PicoFactory;
import io.cucumber.core.backend.ObjectFactory;

public class CustomPicoFactory implements ObjectFactory {
    private final PicoFactory delegate = new PicoFactory();

    public CustomPicoFactory(){
        handleCommon();
    }

    private void handleCommon(){
        addClass(UITodoActions.class);
        addClass(UIDriverActions.class);
    }

    @Override
    public void start() {
        delegate.start();
    }

    @Override
    public void stop() {
        delegate.stop();
    }

    @Override
    public boolean addClass(Class<?> aClass) {
        return delegate.addClass(aClass);
    }

    @Override
    public <T> T getInstance(Class<T> aClass) {
        return delegate.getInstance(aClass);
    }
}


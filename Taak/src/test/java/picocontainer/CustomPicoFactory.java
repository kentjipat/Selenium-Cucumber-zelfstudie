package picocontainer;

import helpers.DriverHelper;
import io.cucumber.picocontainer.PicoFactory;
import io.cucumber.core.backend.ObjectFactory;
import pages.TodosPage;

import java.lang.annotation.Annotation;

public class CustomPicoFactory implements ObjectFactory {
    private final PicoFactory delegate = new PicoFactory();

    public CustomPicoFactory(){
        handleCommon();
    }

    private void handleCommon(){
        addClass(TodosPage.class);
        addClass(DriverHelper.class);
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


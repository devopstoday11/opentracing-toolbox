package org.zalando.opentracing.proxy;

import io.opentracing.SpanContext;
import io.opentracing.propagation.Format;
import org.zalando.opentracing.proxy.Injection.Injector;

enum NoopInjector implements Injector {

    NOOP;

    @Override
    public <C> void inject(
            final SpanContext context,
            final Format<C> format,
            final C carrier) {
        // do nothing
    }

}

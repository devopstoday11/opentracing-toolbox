package org.zalando.opentracing.jdbc.span;

import io.opentracing.Span;
import org.apiguardian.api.API;

import java.sql.Statement;
import java.util.List;

import static io.opentracing.tag.Tags.DB_STATEMENT;
import static org.apiguardian.api.API.Status.EXPERIMENTAL;

/**
 * Sets the <code>db.statement</code> span tag.
 *
 * @see <a href="https://opentracing.io/specification/conventions/#span-tags-table">Standard Span Tags</a>
 */
@API(status = EXPERIMENTAL)
public final class DatabaseStatementSpanDecorator implements SpanDecorator {

    @Override
    public void onQuery(
            final Span span,
            final Statement statement,
            final List<String> queries) {

        span.setTag(DB_STATEMENT, String.join("\n", queries));
    }

}

package io.github.yunan9.dpex.extractor;

import io.github.yunan9.dpex.extractor.impl.BuiltinDelimitedExpressionExtractor;
import org.jetbrains.annotations.NotNull;

public interface DelimitedExpressionExtractor<T> {

  DelimitedExpressionExtractor<@NotNull String> BUILTIN_DELIMITED_EXPRESSION_EXTRACTOR =
      new BuiltinDelimitedExpressionExtractor();
}

package io.github.yunan9.dpex.evaluator.context;

import io.github.yunan9.pointer.key.PointerKey;
import io.github.yunan9.pointer.store.PointerStore;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public sealed interface DelimitedExpressionEvaluatorContext extends PointerStore.Holder
    permits DelimitedExpressionEvaluatorContextImpl {

  PointerKey<String> EXPRESSION_VALUE_POINTER_KEY =
      PointerKey.newPointerKey("expression", String.class);

  @Contract("_, _ -> new")
  static @NotNull DelimitedExpressionEvaluatorContext newDelimitedExpressionEvaluatorContext(
      final @NotNull PointerStore pointerStore, final @NotNull String expressionValue) {
    return new DelimitedExpressionEvaluatorContextImpl(pointerStore, expressionValue);
  }

  @Override
  @NotNull
  PointerStore getPointerStore();
}

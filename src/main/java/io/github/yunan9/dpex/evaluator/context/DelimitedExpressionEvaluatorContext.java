package io.github.yunan9.dpex.evaluator.context;

import io.github.yunan9.pointer.store.PointerStore;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public sealed interface DelimitedExpressionEvaluatorContext extends PointerStore.Holder
    permits DelimitedExpressionEvaluatorContextImpl {

  @Contract(value = "_ -> new", pure = true)
  static @NotNull DelimitedExpressionEvaluatorContext newDelimitedExpressionEvaluatorContext(
      final @NotNull PointerStore pointerStore) {
    return new DelimitedExpressionEvaluatorContextImpl(pointerStore);
  }

  @Override
  @NotNull
  PointerStore getPointerStore();
}

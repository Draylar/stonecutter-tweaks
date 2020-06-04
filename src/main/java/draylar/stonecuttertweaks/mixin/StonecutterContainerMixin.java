package draylar.stonecuttertweaks.mixin;

import net.minecraft.container.Property;
import net.minecraft.container.StonecutterContainer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(StonecutterContainer.class)
public class StonecutterContainerMixin {

    @Redirect(
            method = "updateInput",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/container/Property;set(I)V")
    )
    private void beforeReturn(Property property, int value) {

    }
}

package draylar.stonecuttertweaks.mixin;

import net.minecraft.screen.Property;
import net.minecraft.screen.StonecutterScreenHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(StonecutterScreenHandler.class)
public class StonecutterContainerMixin {

    @Redirect(
            method = "updateInput",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/screen/Property;set(I)V")
    )
    private void beforeReturn(Property property, int value) {

    }
}

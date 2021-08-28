package instart.demonslayer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("demonslayer")
public class DemonSlayerMode {
	
	public DemonSlayerMode()
	{
	FMLJavaModLoadingContext.get().getModEventBus().addListener(this::auSetupCommun);
	}
	
	private void auSetupCommun(FMLCommonSetupEvent event)
	{
		
	}
}

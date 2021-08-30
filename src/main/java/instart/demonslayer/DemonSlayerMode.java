package instart.demonslayer;

//import org.apache.logging.log4j.Logger;
import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("demonslayer")
public class DemonSlayerMode {
	
	//private static Logger logger;
	
	public DemonSlayerMode()
	{
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
	}
	
	private void commonSetup(FMLCommonSetupEvent event)
	{
		
	}
	
	private void registerBlocks(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(new instart.demonslayer.commun.block.MuzanBloodOreBlock());
	}
}

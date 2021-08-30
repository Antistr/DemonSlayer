package instart.demonslayer.commun.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class MuzanBloodOreBlock extends Block {
	
	public MuzanBloodOreBlock()
	{
		super(AbstractBlock.Properties
				.of(Material.STONE,MaterialColor.STONE)
				.requiresCorrectToolForDrops()
				.strength(1.5F, 6.0F)
				.sound(SoundType.STONE));
	}
}

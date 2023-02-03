package net.fabricmc.example;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.example.block.AtmBlock;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Register implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	//item

	public static final Item CASH_1S = Registry.register(Registry.ITEM,new Identifier("money","cash_1s"),
			new Item(new FabricItemSettings()));
	public static final Item CASH_2S = Registry.register(Registry.ITEM,new Identifier("money","cash_2s"),
			new Item(new FabricItemSettings()));
    public static final Item CASH_5S = Registry.register(Registry.ITEM,new Identifier("money","cash_5s"),
            new Item(new FabricItemSettings()));
    public static final Item CASH_10S = Registry.register(Registry.ITEM,new Identifier("money","cash_10s"),
            new Item(new FabricItemSettings()));
    public static final Item CASH_20S = Registry.register(Registry.ITEM,new Identifier("money","cash_20s"),
            new Item(new FabricItemSettings()));
    public static final Item CASH_50S = Registry.register(Registry.ITEM,new Identifier("money","cash_50s"),
            new Item(new FabricItemSettings()));
    public static final Item CASH_100S = Registry.register(Registry.ITEM,new Identifier("money","cash_100s"),
            new Item(new FabricItemSettings()));
    public static final Item CASH_200S = Registry.register(Registry.ITEM,new Identifier("money","cash_200s"),
            new Item(new FabricItemSettings()));
    public static final Item CASH_500S = Registry.register(Registry.ITEM,new Identifier("money","cash_500s"),
            new Item(new FabricItemSettings()));
    public static final Item CASH_1000S = Registry.register(Registry.ITEM,new Identifier("money","cash_1000s"),
            new Item(new FabricItemSettings()));
	public static final Item COIN_1S = Registry.register(Registry.ITEM,new Identifier("money","coin_1s"),
			new Item(new FabricItemSettings()));
	public static final Item COIN_1SS = Registry.register(Registry.ITEM,new Identifier("money","coin_1ss"),
			new Item(new FabricItemSettings()));
	public static final Item COIN_2S = Registry.register(Registry.ITEM,new Identifier("money","coin_2s"),
			new Item(new FabricItemSettings()));
	public static final Item COIN_2SS = Registry.register(Registry.ITEM,new Identifier("money","coin_2ss"),
			new Item(new FabricItemSettings()));
	public static final Item COIN_5S = Registry.register(Registry.ITEM,new Identifier("money","coin_5s"),
			new Item(new FabricItemSettings()));
	public static final Item COIN_5SS = Registry.register(Registry.ITEM,new Identifier("money","coin_5ss"),
			new Item(new FabricItemSettings()));

	//food

	public static final Item COINFOOD = Registry.register(Registry.ITEM,new Identifier("money","coinfood"),
			new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(5).saturationModifier(0.6F).snack().build()).maxCount(64)));


	//block

	public static final AtmBlock ATM = Registry.register(Registry.BLOCK,new Identifier("money","atm"),new AtmBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f)));

	//group

	public static final ItemGroup MONEY = FabricItemGroupBuilder.create(
					new Identifier("money", "money"))
			.icon(() -> new ItemStack(Register.COINFOOD))
			.appendItems(stacks ->{
				stacks.add(new ItemStack(Register.CASH_1S));
				stacks.add(new ItemStack(Register.CASH_2S));
				stacks.add(new ItemStack(Register.CASH_5S));
				stacks.add(new ItemStack(Register.CASH_10S));
				stacks.add(new ItemStack(Register.CASH_20S));
				stacks.add(new ItemStack(Register.CASH_50S));
				stacks.add(new ItemStack(Register.CASH_100S));
				stacks.add(new ItemStack(Register.CASH_200S));
				stacks.add(new ItemStack(Register.CASH_500S));
				stacks.add(new ItemStack(Register.CASH_1000S));
				stacks.add(new ItemStack(Register.COIN_1S));
				stacks.add(new ItemStack(Register.COIN_1SS));
				stacks.add(new ItemStack(Register.COIN_2S));
				stacks.add(new ItemStack(Register.COIN_2SS));
				stacks.add(new ItemStack(Register.COIN_5S));
				stacks.add(new ItemStack(Register.COIN_5SS));
				stacks.add(new ItemStack(Register.ATM));
				stacks.add(new ItemStack(Register.COINFOOD));
			})
			.build();


	@Override
	public void onInitialize() {
		LOGGER.info("Money!");
		//block->item
		Registry.register(Registry.ITEM,new Identifier("money","atm"),
				new BlockItem(ATM,new FabricItemSettings()));
	}
}

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.soytutta.mynethersdelight.core.data.recipes;

import com.soytutta.mynethersdelight.common.tag.MNDTags;
import com.soytutta.mynethersdelight.common.registry.MNDItems;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import vectorwing.farmersdelight.client.recipebook.CookingPotRecipeBookTab;
import vectorwing.farmersdelight.common.registry.ModItems;
import vectorwing.farmersdelight.common.tag.ForgeTags;
import vectorwing.farmersdelight.data.builder.CookingPotRecipeBuilder;

import java.util.function.Consumer;


public class MNDCookingRecipes {
    public static final int FAST_COOKING = 100;
    public static final int NORMAL_COOKING = 200;
    public static final int SLOW_COOKING = 400;
    public static final float SMALL_EXP = 0.35F;
    public static final float MEDIUM_EXP = 1.0F;
    public static final float LARGE_EXP = 2.0F;
    public MNDCookingRecipes() {
    }
    public static void register(Consumer<FinishedRecipe> consumer) {
        cookMinecraftSoups(consumer);
        cookMeals(consumer);
    }
    private static void cookMinecraftSoups(Consumer<FinishedRecipe> consumer) {
        CookingPotRecipeBuilder.cookingPotRecipe(MNDItems.STRIDER_STEW.get(), 1, 400, 1.0F)
                .addIngredient(MNDTags.STRIDER_MEATS)
                .addIngredient(Items.WARPED_FUNGUS, 1)
                .addIngredient(Ingredient.of(Items.WARPED_FUNGUS, Items.CRIMSON_FUNGUS))
                .addIngredient(Ingredient.of(Items.WARPED_ROOTS, Items.CRIMSON_ROOTS))
                .unlockedByAnyIngredient(Items.CRIMSON_FUNGUS, Items.WARPED_FUNGUS, MNDItems.STRIDER_SLICE.get(), MNDItems.MINCED_STRIDER.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(consumer, "mynethersdelight:cooking/strider_stew");

        CookingPotRecipeBuilder.cookingPotRecipe(MNDItems.SPICY_HOGLIN_STEW.get(), 1, 200, 1.0F)
                .addIngredient(MNDTags.LOIN_HOGLIN)
                .addIngredient(Items.POTATO)
                .addIngredient(Items.CARROT)
                .addIngredient(MNDTags.BULLET_PEPPER)
                .unlockedByAnyIngredient(MNDItems.HOGLIN_LOIN.get(), MNDItems.BULLET_PEPPER.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(consumer, "mynethersdelight:cooking/spicy_hoglin_stew");
    }
    private static void cookMeals(Consumer<FinishedRecipe> consumer) {

        CookingPotRecipeBuilder.cookingPotRecipe(MNDItems.STRIDER_WITH_GRILLED_FUNGUS.get(), 1, 400, 1.0F)
                .addIngredient(MNDTags.STRIDER_SLICE)
                .addIngredient(Items.CRIMSON_FUNGUS, 1)
                .addIngredient(Items.WARPED_FUNGUS, 1)
                .addIngredient(Ingredient.of(Items.WARPED_FUNGUS, Items.CRIMSON_FUNGUS))
                .unlockedByAnyIngredient(Items.CRIMSON_FUNGUS, Items.WARPED_FUNGUS, MNDItems.STRIDER_SLICE.get(), MNDItems.MINCED_STRIDER.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(consumer, "mynethersdelight:cooking/strider_and_grilled_fungus");


        CookingPotRecipeBuilder.cookingPotRecipe(MNDItems.CRIMSON_STROGANOFF.get(), 1, 400, 1.0F)
                .addIngredient(MNDTags.MINCED_STRIDER)
                .addIngredient(Items.CRIMSON_FUNGUS, 2)
                .addIngredient(ForgeTags.MILK)
                .addIngredient(ModItems.RAW_PASTA.get())
                .unlockedByAnyIngredient(MNDItems.MINCED_STRIDER.get(), Items.CRIMSON_FUNGUS)
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(consumer, "mynethersdelight:cooking/crimson_stroganoff");

        CookingPotRecipeBuilder.cookingPotRecipe(MNDItems.FRIED_HOGLIN_CHOP.get(), 1, 200, 1.0F)
                .addIngredient(MNDTags.LOIN_HOGLIN)
                .addIngredient(Items.WHEAT)
                .addIngredient(ForgeTags.MILK)
                .addIngredient(ForgeTags.EGGS)
                .addIngredient(MNDTags.BULLET_PEPPER)
                .unlockedByAnyIngredient(MNDItems.HOGLIN_LOIN.get(), MNDItems.BULLET_PEPPER.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(consumer, "mynethersdelight:cooking/fried_hoglin_chop");

        CookingPotRecipeBuilder.cookingPotRecipe(MNDItems.HOT_WINGS.get(), 1, 150, 0.35F)
                .addIngredient(ForgeTags.RAW_CHICKEN)
                .addIngredient(MNDTags.HOT_SPICE)
                .addIngredient(ForgeTags.CROPS_ONION)
                .unlockedByAnyIngredient(MNDItems.BULLET_PEPPER.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(consumer, "mynethersdelight:cooking/hot_wings");

        CookingPotRecipeBuilder.cookingPotRecipe(MNDItems.SPICY_CURRY.get(), 1, 200, 1.0F)
                .addIngredient(MNDTags.CURRY_MEATS)
                .addIngredient(ForgeTags.MILK)
                .addIngredient(MNDTags.HOT_SPICE)
                .addIngredient(ForgeTags.CROPS_RICE)
                .addIngredient(ForgeTags.VEGETABLES_CARROT)
                .addIngredient(ModItems.PUMPKIN_SLICE.get())
                .unlockedByAnyIngredient(MNDItems.BULLET_PEPPER.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(consumer, "mynethersdelight:cooking/spicy_curry");

        CookingPotRecipeBuilder.cookingPotRecipe(MNDItems.ROAST_STUFFED_HOGLIN.get(), 1, 700, 2.0F,Items.BOWL)
                .addIngredient(MNDTags.HOT_SPICE)
                .addIngredient(MNDTags.STUFFED_HOGLIN)
                .addIngredient(Items.CRIMSON_FUNGUS)
                .addIngredient(ModItems.NETHER_SALAD.get(), 2)
                .unlockedByAnyIngredient(MNDItems.RAW_STUFFED_HOGLIN.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(consumer, "mynethersdelight:cooking/roast_stuffed_hoglin");

        CookingPotRecipeBuilder.cookingPotRecipe(MNDItems.CHILIDOG.get(), 1, 200, 0.35F,MNDItems.HOTDOG.get())
                .addIngredient(MNDTags.HOT_SPICE)
                .addIngredient(ForgeTags.RAW_BEEF)
                .addIngredient(Items.NETHER_WART)
                .unlockedByAnyIngredient(MNDItems.HOTDOG.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(consumer, "mynethersdelight:cooking/chilidog");
        CookingPotRecipeBuilder.cookingPotRecipe((ItemLike)MNDItems.SAUSAGE_AND_POTATOES.get(), 1, 200, 0.35F)
                .addIngredient(ForgeTags.VEGETABLES_POTATO)
                .addIngredient(MNDItems.HOGLIN_SAUSAGE.get(), 2)
                .unlockedByAnyIngredient(MNDItems.HOGLIN_SAUSAGE.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(consumer, "mynethersdelight:cooking/sausage_and_potatoes");

        CookingPotRecipeBuilder.cookingPotRecipe(MNDItems.HOT_CREAM.get(), 1, 200, 1.0F,Items.LAVA_BUCKET)
                .addIngredient(MNDTags.HOT_SPICE)
                .addIngredient(Items.MAGMA_CREAM)
                .addIngredient(MNDTags.BULLET_PEPPER)
                .addIngredient(Items.MAGMA_CREAM)
                .addIngredient(ForgeTags.EGGS)
                .addIngredient(Items.MAGMA_CREAM)

                .unlockedByAnyIngredient(Items.LAVA_BUCKET)
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(consumer, "mynethersdelight:cooking/hotcream");
        }
}
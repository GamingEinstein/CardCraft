package net.gamingeinstein.cardcraft.datagen.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class EnglishLangProvider extends FabricLanguageProvider {
    public EnglishLangProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
//        translationBuilder.add(SIMPLE_ITEM, "Simple Item");
//        translationBuilder.add(SIMPLE_BLOCK, "Simple Block");
//        translationBuilder.add(SIMPLE_ITEM_GROUP, "Simple Item Group");
//
//        // Load an existing language file.
//        try {
//            Path existingFilePath = dataGenerator.getModContainer().findPath("assets/mymod/lang/en_us.existing.json").get();
//            translationBuilder.add(existingFilePath);
//        } catch (Exception e) {
//            throw new RuntimeException("Failed to add existing language file!", e);
//        }
    }
}

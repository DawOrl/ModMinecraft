public class test implements  ModInitializer {
    public static final Item CUSTOM_ITEM = new Item(new FabricItemSettings());

    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM, new Identifier("tutorial", "custem_item"), CUSTOM_ITEM);
    }
}
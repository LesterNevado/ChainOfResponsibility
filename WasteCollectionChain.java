public class WasteCollectionChain implements CollectionChain{
    private CollectionChain nextChain;
    public WasteCollectionChain() {
        // Initialize the chain
        this.nextChain = new OrganicCollection();
        CollectionChain c2 = new RecyclableCollection();
        CollectionChain c3 = new HazardousCollection();

        // Set the chain of responsibility
        nextChain.setNextChain(c2);
        c2.setNextChain(c3);
    }

    public void collect(WasteContainer container) {
        nextChain.collect(container);
    }


    @Override
    public void setNextChain(CollectionChain nextChain) {
        this.nextChain = nextChain;
    }
}

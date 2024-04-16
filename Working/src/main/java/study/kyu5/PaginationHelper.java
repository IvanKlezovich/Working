package study.kyu5;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PaginationHelper<I> {
    private Optional<Integer> capacitySite;
    private Optional<Integer> capacityPages;
    List<Integer> pages = new ArrayList<>();
    private final int size;
    /**
     * The constructor takes in an array of items and an integer indicating how many
     * items fit within a single page
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {

        capacitySite = Optional.ofNullable(!collection.isEmpty() ? collection.size(): null);
        capacityPages = Optional.ofNullable(!collection.isEmpty() ?
                Math.round((float) collection.size() / itemsPerPage)
                : null);
        size = itemsPerPage;
        int capacity = 0;

        if (capacitySite.isPresent()) {
            capacity = capacitySite.get();
        }

        if(capacityPages.isPresent()){
            for (int i = 1; i <= capacityPages.get(); i++) {
                if(capacity > size){
                    pages.add(size);
                    capacity -= size;
                }else{
                    pages.add(capacity);
                }
            }
        }
    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return capacitySite.orElse(0);
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        return capacityPages.orElse(0);
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {
        Optional<Integer> answer = Optional.ofNullable(pageIndex > -1 ?
                capacityPages.filter(integer -> integer - 1 >= pageIndex).map(integer -> pages.get(pageIndex)).orElse(null)
                                    :null);
        return answer.orElse(-1);
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        Optional<Integer> answer = Optional.ofNullable(itemIndex > 0 ?
                                        capacitySite.isPresent() && capacityPages.isPresent() ?
                                            (itemIndex / size <= capacityPages.get() ?
                                                 itemIndex / size
                                            : null)
                                        : null
                                    : null);
        return answer.orElse(-1);
    }
}

package api.dto;

import java.util.List;

public class ItemsResponse {

   private Integer total;
   private List<Item> items;
   private String next_page;
   private String prev_page;
}

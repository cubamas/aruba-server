package com.bahteramas.app.model.response;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PagingResponse {

  private Integer page; // current page
  private Integer totalItems; // banyak items
  private Integer pageSize; // banya pagenya

  private Integer size; // limit nya berapa
}
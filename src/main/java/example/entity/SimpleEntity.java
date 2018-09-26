package example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SimpleEntity {
  @Id
  private Long id;
}

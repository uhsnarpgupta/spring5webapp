package guru.springframework.spring5webapp.model;

import javax.persistence.*;

@Entity
@Table(name = "item_detail")
public class ItemDetail {

    private Long id;
    private Integer number;
    private String detail;
    private Item item;

    public ItemDetail() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "number_of_items")
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @OneToOne(mappedBy = "itemDetail")
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "ItemDetail{" +
                "id=" + id +
                ", number=" + number +
                ", detail='" + detail + '\'' +
                '}';
    }
}

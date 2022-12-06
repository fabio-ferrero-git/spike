package org.spikeTassProject.contentmicroservice.model;

import javax.persistence.*;

@Entity
@Table(name = "Content")
public class Content {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "useremail")
    private String useremail;

    @Column(name = "text")
    private String text;

    public Content(String useremail, String text) {
        this.useremail = useremail;
        this.text = text;
    }

    public Content() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Content{" +
                "id=" + id +
                ", useremail='" + useremail + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}

package com.hendisantika.springbootjdbc3.entity;

import lombok.*;

import javax.persistence.*;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-jdbc3
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 19/09/18
 * Time: 06.16
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "system_example")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class SystemExample {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    private String name;
    private String lastaudit;

}
package fca.suayed.dto;

import org.jdbi.v3.core.mapper.reflect.ColumnName;

public class ClientDto {
    private Long id;
    private String name;
    private String last_name;
    private String second_name;
    private String rfc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ColumnName("nombre")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ColumnName("apellido_paterno")
    public String getLastName() {
        return last_name;
    }

    public void setLastName(String last_name) {
        this.last_name = last_name;
    }

    @ColumnName("apellido_materno")
    public String getSecondName() {
        return this.second_name;
    }

    public void setLAstName(String second_name) {
        this.second_name = second_name;
    }

    @ColumnName("rfc")
    public String getRfc() {
        return rfc;
    }

    public void setRFC(String rfc) {
        this.rfc = rfc;
    }

}

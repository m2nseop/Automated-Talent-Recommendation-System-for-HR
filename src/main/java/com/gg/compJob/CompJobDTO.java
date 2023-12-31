package com.gg.compJob;

import org.apache.ibatis.type.Alias;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Alias("compjob")
@Getter
@Setter
@ToString
public class CompJobDTO {
    String A;
    String B;
    String C;
    String D;
    int comp_id;

    public CompJobDTO() {
    }

    public CompJobDTO(String A, String B, String C, String D, int comp_id) {
        super();
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
        this.comp_id = comp_id;
    }
}

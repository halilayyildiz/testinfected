package org.ankarajug.testinfected.domain;

import org.ankarajug.testinfected.domain.builder.Action;

import javax.persistence.*;

/**
 * User: mertcaliskan
 * Date: 2/8/13
 */
@Entity
public class CalculationResult {

    private Long id;
    private Action action;
    private Double result;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    public Long getId() {
        return id;
    }

    @Enumerated(EnumType.STRING)
    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CalculationResult that = (CalculationResult) o;

        if (result != null ? !result.equals(that.result) : that.result != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return result != null ? result.hashCode() : 0;
    }
}

package com.ge.predix.solsvc.bootstrap.tbs.dto.datapoints.request;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "values"
})
public class Qualities {

    @JsonProperty("values")
    private List<Integer> values = new ArrayList<Integer>();

    /**
     * 
     * @return
     *     The values
     */
    @JsonProperty("values")
    public List<Integer> getValues() {
        return values;
    }

    /**
     * 
     * @param values
     *     The values
     */
    @JsonProperty("values")
    public void setValues(List<Integer> values) {
        this.values = values;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

 
    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(values).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Qualities) == false) {
            return false;
        }
        Qualities rhs = ((Qualities) other);
        return new EqualsBuilder().append(values, rhs.values).isEquals();
    }

}

package net.chrisdolan.pcgen.drools.input;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("skill")
public class SkillInput {
    @XStreamAlias("name")
    @XStreamAsAttribute
    private String name;

    @XStreamAlias("ranks")
    @XStreamAsAttribute
    private int ranks;

    public SkillInput() {
    }
    public SkillInput(String name, int ranks) {
        this.name = name;
        this.ranks = ranks;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRanks() {
        return ranks;
    }
    public void setRanks(int ranks) {
        this.ranks = ranks;
    }

    public String toString() {
        return "Skill[" + name + "=" + ranks + "]";
    }
}

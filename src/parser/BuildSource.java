// $Id$

package parser;

import javax.persistence.*;

@Entity
@Table(name = "\"BuildSource\"")
public class BuildSource implements java.io.Serializable {
    private static final long serialVersionUID = 1570473935355383463L;

    public BuildSource() {
    }

    @Column(name = "id")
    @Id
    @GeneratedValue
    long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @JoinColumn(name = "file", nullable = false)
    File file;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    @JoinColumn(name = "action", nullable = false)
    BuildAction action;

    public BuildAction getAction() {
        return action;
    }

    public void setAction(BuildAction action) {
        this.action = action;
    }
}

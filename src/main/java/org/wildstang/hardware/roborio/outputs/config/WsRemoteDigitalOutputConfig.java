package org.wildstang.hardware.roborio.outputs.config;

import org.wildstang.framework.hardware.OutputConfig;

/**
 * Contains configurations for remote digital outputs.
 */
public class WsRemoteDigitalOutputConfig implements OutputConfig {

    private String m_networktbl = "RemoteIO";
    private boolean m_default;

    /**
     * Construct the remote digital output config.
     * @param networktbl Network table name.
     * @param p_default Default output value.
     */
    public WsRemoteDigitalOutputConfig(String networktbl, boolean p_default) {
        m_networktbl = networktbl;
        m_default = p_default;
    }

    /**
     * Returns the network table's name.
     * @return The network table name.
     */
    public String getTableName() {
        return m_networktbl;
    }

    /**
     * Returns the default output value.
     * @return The default value.
     */
    public boolean getDefault() {
        return m_default;
    }

    /**
     * Builds a JSON String describing the remote digital output config.
     * @return Network table name.
     */
    @Override
    public String toString() {
        StringBuffer buf = new StringBuffer();
        buf.append("{\"networktbl\": ");
        buf.append(m_networktbl);
        buf.append("}");
        return buf.toString();
    }

}

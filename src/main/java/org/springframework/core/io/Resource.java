package org.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author cjd
 * @description
 * @create 2024-03-19
 */
public interface Resource {

    InputStream getInputStream() throws IOException;

}

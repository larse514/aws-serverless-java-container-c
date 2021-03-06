package com.moodle.users.lambda;

import com.amazonaws.serverless.proxy.internal.model.AwsProxyRequest;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;

/**
 * Created by andrewlarsen on 11/4/17.
 */
public class EnvironmentHelperTest {
    @Mock
    private AwsProxyRequest awsProxyRequest;
    private EnvironmentHelper helper;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        helper = new EnvironmentHelper();
    }
    @Test
    public void getStageNameNullProxy() throws Exception {

        assertFalse(helper.getStageName(null).isPresent());
    }

    @Test
    public void getStageNameNonNullProxy() throws Exception {

        assertFalse(helper.getStageName(awsProxyRequest).isPresent());
    }
}
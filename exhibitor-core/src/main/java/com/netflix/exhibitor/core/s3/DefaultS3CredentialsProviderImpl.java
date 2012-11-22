package com.netflix.exhibitor.core.s3;

/*
 * Copyright 2012 Netflix, Inc.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

public class DefaultS3CredentialsProviderImpl implements S3CredentialsProvider {

    private final AWSCredentialsProvider awsCredentialsProvider;

    public DefaultS3CredentialsProviderImpl()
    {
        this(new DefaultAWSCredentialsProviderChain());
    }

    public DefaultS3CredentialsProviderImpl(AWSCredentialsProvider awsCredentialsProvider)
    {
        this.awsCredentialsProvider = awsCredentialsProvider;
    }


    @Override
    public AWSCredentialsProvider getAWSCredentialProvider() {
        return awsCredentialsProvider;
    }
}

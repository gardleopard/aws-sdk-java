/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an update for a destination in Amazon S3.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/ExtendedS3DestinationUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExtendedS3DestinationUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS credentials. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a>.
     * </p>
     */
    private String roleARN;
    /**
     * <p>
     * The ARN of the S3 bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a>.
     * </p>
     */
    private String bucketARN;
    /**
     * <p>
     * The "YYYY/MM/DD/HH" time format prefix is automatically used for delivered Amazon S3 files. You can specify an
     * extra prefix to be added in front of the time format prefix. If the prefix ends with a slash, it appears as a
     * folder in the S3 bucket. For more information, see <a
     * href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#s3-object-name">Amazon S3 Object Name
     * Format</a> in the <i>Amazon Kinesis Data Firehose Developer Guide</i>.
     * </p>
     */
    private String prefix;
    /**
     * <p>
     * The buffering option.
     * </p>
     */
    private BufferingHints bufferingHints;
    /**
     * <p>
     * The compression format. If no value is specified, the default is <code>UNCOMPRESSED</code>.
     * </p>
     */
    private String compressionFormat;
    /**
     * <p>
     * The encryption configuration. If no value is specified, the default is no encryption.
     * </p>
     */
    private EncryptionConfiguration encryptionConfiguration;
    /**
     * <p>
     * The Amazon CloudWatch logging options for your delivery stream.
     * </p>
     */
    private CloudWatchLoggingOptions cloudWatchLoggingOptions;
    /**
     * <p>
     * The data processing configuration.
     * </p>
     */
    private ProcessingConfiguration processingConfiguration;
    /**
     * <p>
     * Enables or disables Amazon S3 backup mode.
     * </p>
     */
    private String s3BackupMode;
    /**
     * <p>
     * The Amazon S3 destination for backup.
     * </p>
     */
    private S3DestinationUpdate s3BackupUpdate;
    /**
     * <p>
     * The serializer, deserializer, and schema for converting data from the JSON format to the Parquet or ORC format
     * before writing it to Amazon S3.
     * </p>
     */
    private DataFormatConversionConfiguration dataFormatConversionConfiguration;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS credentials. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a>.
     * </p>
     * 
     * @param roleARN
     *        The Amazon Resource Name (ARN) of the AWS credentials. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs) and AWS Service Namespaces</a>.
     */

    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS credentials. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AWS credentials. For more information, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *         (ARNs) and AWS Service Namespaces</a>.
     */

    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS credentials. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a>.
     * </p>
     * 
     * @param roleARN
     *        The Amazon Resource Name (ARN) of the AWS credentials. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs) and AWS Service Namespaces</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExtendedS3DestinationUpdate withRoleARN(String roleARN) {
        setRoleARN(roleARN);
        return this;
    }

    /**
     * <p>
     * The ARN of the S3 bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a>.
     * </p>
     * 
     * @param bucketARN
     *        The ARN of the S3 bucket. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs) and AWS Service Namespaces</a>.
     */

    public void setBucketARN(String bucketARN) {
        this.bucketARN = bucketARN;
    }

    /**
     * <p>
     * The ARN of the S3 bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a>.
     * </p>
     * 
     * @return The ARN of the S3 bucket. For more information, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *         (ARNs) and AWS Service Namespaces</a>.
     */

    public String getBucketARN() {
        return this.bucketARN;
    }

    /**
     * <p>
     * The ARN of the S3 bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a>.
     * </p>
     * 
     * @param bucketARN
     *        The ARN of the S3 bucket. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs) and AWS Service Namespaces</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExtendedS3DestinationUpdate withBucketARN(String bucketARN) {
        setBucketARN(bucketARN);
        return this;
    }

    /**
     * <p>
     * The "YYYY/MM/DD/HH" time format prefix is automatically used for delivered Amazon S3 files. You can specify an
     * extra prefix to be added in front of the time format prefix. If the prefix ends with a slash, it appears as a
     * folder in the S3 bucket. For more information, see <a
     * href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#s3-object-name">Amazon S3 Object Name
     * Format</a> in the <i>Amazon Kinesis Data Firehose Developer Guide</i>.
     * </p>
     * 
     * @param prefix
     *        The "YYYY/MM/DD/HH" time format prefix is automatically used for delivered Amazon S3 files. You can
     *        specify an extra prefix to be added in front of the time format prefix. If the prefix ends with a slash,
     *        it appears as a folder in the S3 bucket. For more information, see <a
     *        href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#s3-object-name">Amazon S3 Object
     *        Name Format</a> in the <i>Amazon Kinesis Data Firehose Developer Guide</i>.
     */

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * The "YYYY/MM/DD/HH" time format prefix is automatically used for delivered Amazon S3 files. You can specify an
     * extra prefix to be added in front of the time format prefix. If the prefix ends with a slash, it appears as a
     * folder in the S3 bucket. For more information, see <a
     * href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#s3-object-name">Amazon S3 Object Name
     * Format</a> in the <i>Amazon Kinesis Data Firehose Developer Guide</i>.
     * </p>
     * 
     * @return The "YYYY/MM/DD/HH" time format prefix is automatically used for delivered Amazon S3 files. You can
     *         specify an extra prefix to be added in front of the time format prefix. If the prefix ends with a slash,
     *         it appears as a folder in the S3 bucket. For more information, see <a
     *         href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#s3-object-name">Amazon S3 Object
     *         Name Format</a> in the <i>Amazon Kinesis Data Firehose Developer Guide</i>.
     */

    public String getPrefix() {
        return this.prefix;
    }

    /**
     * <p>
     * The "YYYY/MM/DD/HH" time format prefix is automatically used for delivered Amazon S3 files. You can specify an
     * extra prefix to be added in front of the time format prefix. If the prefix ends with a slash, it appears as a
     * folder in the S3 bucket. For more information, see <a
     * href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#s3-object-name">Amazon S3 Object Name
     * Format</a> in the <i>Amazon Kinesis Data Firehose Developer Guide</i>.
     * </p>
     * 
     * @param prefix
     *        The "YYYY/MM/DD/HH" time format prefix is automatically used for delivered Amazon S3 files. You can
     *        specify an extra prefix to be added in front of the time format prefix. If the prefix ends with a slash,
     *        it appears as a folder in the S3 bucket. For more information, see <a
     *        href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html#s3-object-name">Amazon S3 Object
     *        Name Format</a> in the <i>Amazon Kinesis Data Firehose Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExtendedS3DestinationUpdate withPrefix(String prefix) {
        setPrefix(prefix);
        return this;
    }

    /**
     * <p>
     * The buffering option.
     * </p>
     * 
     * @param bufferingHints
     *        The buffering option.
     */

    public void setBufferingHints(BufferingHints bufferingHints) {
        this.bufferingHints = bufferingHints;
    }

    /**
     * <p>
     * The buffering option.
     * </p>
     * 
     * @return The buffering option.
     */

    public BufferingHints getBufferingHints() {
        return this.bufferingHints;
    }

    /**
     * <p>
     * The buffering option.
     * </p>
     * 
     * @param bufferingHints
     *        The buffering option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExtendedS3DestinationUpdate withBufferingHints(BufferingHints bufferingHints) {
        setBufferingHints(bufferingHints);
        return this;
    }

    /**
     * <p>
     * The compression format. If no value is specified, the default is <code>UNCOMPRESSED</code>.
     * </p>
     * 
     * @param compressionFormat
     *        The compression format. If no value is specified, the default is <code>UNCOMPRESSED</code>.
     * @see CompressionFormat
     */

    public void setCompressionFormat(String compressionFormat) {
        this.compressionFormat = compressionFormat;
    }

    /**
     * <p>
     * The compression format. If no value is specified, the default is <code>UNCOMPRESSED</code>.
     * </p>
     * 
     * @return The compression format. If no value is specified, the default is <code>UNCOMPRESSED</code>.
     * @see CompressionFormat
     */

    public String getCompressionFormat() {
        return this.compressionFormat;
    }

    /**
     * <p>
     * The compression format. If no value is specified, the default is <code>UNCOMPRESSED</code>.
     * </p>
     * 
     * @param compressionFormat
     *        The compression format. If no value is specified, the default is <code>UNCOMPRESSED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CompressionFormat
     */

    public ExtendedS3DestinationUpdate withCompressionFormat(String compressionFormat) {
        setCompressionFormat(compressionFormat);
        return this;
    }

    /**
     * <p>
     * The compression format. If no value is specified, the default is <code>UNCOMPRESSED</code>.
     * </p>
     * 
     * @param compressionFormat
     *        The compression format. If no value is specified, the default is <code>UNCOMPRESSED</code>.
     * @see CompressionFormat
     */

    public void setCompressionFormat(CompressionFormat compressionFormat) {
        withCompressionFormat(compressionFormat);
    }

    /**
     * <p>
     * The compression format. If no value is specified, the default is <code>UNCOMPRESSED</code>.
     * </p>
     * 
     * @param compressionFormat
     *        The compression format. If no value is specified, the default is <code>UNCOMPRESSED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CompressionFormat
     */

    public ExtendedS3DestinationUpdate withCompressionFormat(CompressionFormat compressionFormat) {
        this.compressionFormat = compressionFormat.toString();
        return this;
    }

    /**
     * <p>
     * The encryption configuration. If no value is specified, the default is no encryption.
     * </p>
     * 
     * @param encryptionConfiguration
     *        The encryption configuration. If no value is specified, the default is no encryption.
     */

    public void setEncryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
        this.encryptionConfiguration = encryptionConfiguration;
    }

    /**
     * <p>
     * The encryption configuration. If no value is specified, the default is no encryption.
     * </p>
     * 
     * @return The encryption configuration. If no value is specified, the default is no encryption.
     */

    public EncryptionConfiguration getEncryptionConfiguration() {
        return this.encryptionConfiguration;
    }

    /**
     * <p>
     * The encryption configuration. If no value is specified, the default is no encryption.
     * </p>
     * 
     * @param encryptionConfiguration
     *        The encryption configuration. If no value is specified, the default is no encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExtendedS3DestinationUpdate withEncryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
        setEncryptionConfiguration(encryptionConfiguration);
        return this;
    }

    /**
     * <p>
     * The Amazon CloudWatch logging options for your delivery stream.
     * </p>
     * 
     * @param cloudWatchLoggingOptions
     *        The Amazon CloudWatch logging options for your delivery stream.
     */

    public void setCloudWatchLoggingOptions(CloudWatchLoggingOptions cloudWatchLoggingOptions) {
        this.cloudWatchLoggingOptions = cloudWatchLoggingOptions;
    }

    /**
     * <p>
     * The Amazon CloudWatch logging options for your delivery stream.
     * </p>
     * 
     * @return The Amazon CloudWatch logging options for your delivery stream.
     */

    public CloudWatchLoggingOptions getCloudWatchLoggingOptions() {
        return this.cloudWatchLoggingOptions;
    }

    /**
     * <p>
     * The Amazon CloudWatch logging options for your delivery stream.
     * </p>
     * 
     * @param cloudWatchLoggingOptions
     *        The Amazon CloudWatch logging options for your delivery stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExtendedS3DestinationUpdate withCloudWatchLoggingOptions(CloudWatchLoggingOptions cloudWatchLoggingOptions) {
        setCloudWatchLoggingOptions(cloudWatchLoggingOptions);
        return this;
    }

    /**
     * <p>
     * The data processing configuration.
     * </p>
     * 
     * @param processingConfiguration
     *        The data processing configuration.
     */

    public void setProcessingConfiguration(ProcessingConfiguration processingConfiguration) {
        this.processingConfiguration = processingConfiguration;
    }

    /**
     * <p>
     * The data processing configuration.
     * </p>
     * 
     * @return The data processing configuration.
     */

    public ProcessingConfiguration getProcessingConfiguration() {
        return this.processingConfiguration;
    }

    /**
     * <p>
     * The data processing configuration.
     * </p>
     * 
     * @param processingConfiguration
     *        The data processing configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExtendedS3DestinationUpdate withProcessingConfiguration(ProcessingConfiguration processingConfiguration) {
        setProcessingConfiguration(processingConfiguration);
        return this;
    }

    /**
     * <p>
     * Enables or disables Amazon S3 backup mode.
     * </p>
     * 
     * @param s3BackupMode
     *        Enables or disables Amazon S3 backup mode.
     * @see S3BackupMode
     */

    public void setS3BackupMode(String s3BackupMode) {
        this.s3BackupMode = s3BackupMode;
    }

    /**
     * <p>
     * Enables or disables Amazon S3 backup mode.
     * </p>
     * 
     * @return Enables or disables Amazon S3 backup mode.
     * @see S3BackupMode
     */

    public String getS3BackupMode() {
        return this.s3BackupMode;
    }

    /**
     * <p>
     * Enables or disables Amazon S3 backup mode.
     * </p>
     * 
     * @param s3BackupMode
     *        Enables or disables Amazon S3 backup mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3BackupMode
     */

    public ExtendedS3DestinationUpdate withS3BackupMode(String s3BackupMode) {
        setS3BackupMode(s3BackupMode);
        return this;
    }

    /**
     * <p>
     * Enables or disables Amazon S3 backup mode.
     * </p>
     * 
     * @param s3BackupMode
     *        Enables or disables Amazon S3 backup mode.
     * @see S3BackupMode
     */

    public void setS3BackupMode(S3BackupMode s3BackupMode) {
        withS3BackupMode(s3BackupMode);
    }

    /**
     * <p>
     * Enables or disables Amazon S3 backup mode.
     * </p>
     * 
     * @param s3BackupMode
     *        Enables or disables Amazon S3 backup mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3BackupMode
     */

    public ExtendedS3DestinationUpdate withS3BackupMode(S3BackupMode s3BackupMode) {
        this.s3BackupMode = s3BackupMode.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon S3 destination for backup.
     * </p>
     * 
     * @param s3BackupUpdate
     *        The Amazon S3 destination for backup.
     */

    public void setS3BackupUpdate(S3DestinationUpdate s3BackupUpdate) {
        this.s3BackupUpdate = s3BackupUpdate;
    }

    /**
     * <p>
     * The Amazon S3 destination for backup.
     * </p>
     * 
     * @return The Amazon S3 destination for backup.
     */

    public S3DestinationUpdate getS3BackupUpdate() {
        return this.s3BackupUpdate;
    }

    /**
     * <p>
     * The Amazon S3 destination for backup.
     * </p>
     * 
     * @param s3BackupUpdate
     *        The Amazon S3 destination for backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExtendedS3DestinationUpdate withS3BackupUpdate(S3DestinationUpdate s3BackupUpdate) {
        setS3BackupUpdate(s3BackupUpdate);
        return this;
    }

    /**
     * <p>
     * The serializer, deserializer, and schema for converting data from the JSON format to the Parquet or ORC format
     * before writing it to Amazon S3.
     * </p>
     * 
     * @param dataFormatConversionConfiguration
     *        The serializer, deserializer, and schema for converting data from the JSON format to the Parquet or ORC
     *        format before writing it to Amazon S3.
     */

    public void setDataFormatConversionConfiguration(DataFormatConversionConfiguration dataFormatConversionConfiguration) {
        this.dataFormatConversionConfiguration = dataFormatConversionConfiguration;
    }

    /**
     * <p>
     * The serializer, deserializer, and schema for converting data from the JSON format to the Parquet or ORC format
     * before writing it to Amazon S3.
     * </p>
     * 
     * @return The serializer, deserializer, and schema for converting data from the JSON format to the Parquet or ORC
     *         format before writing it to Amazon S3.
     */

    public DataFormatConversionConfiguration getDataFormatConversionConfiguration() {
        return this.dataFormatConversionConfiguration;
    }

    /**
     * <p>
     * The serializer, deserializer, and schema for converting data from the JSON format to the Parquet or ORC format
     * before writing it to Amazon S3.
     * </p>
     * 
     * @param dataFormatConversionConfiguration
     *        The serializer, deserializer, and schema for converting data from the JSON format to the Parquet or ORC
     *        format before writing it to Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExtendedS3DestinationUpdate withDataFormatConversionConfiguration(DataFormatConversionConfiguration dataFormatConversionConfiguration) {
        setDataFormatConversionConfiguration(dataFormatConversionConfiguration);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRoleARN() != null)
            sb.append("RoleARN: ").append(getRoleARN()).append(",");
        if (getBucketARN() != null)
            sb.append("BucketARN: ").append(getBucketARN()).append(",");
        if (getPrefix() != null)
            sb.append("Prefix: ").append(getPrefix()).append(",");
        if (getBufferingHints() != null)
            sb.append("BufferingHints: ").append(getBufferingHints()).append(",");
        if (getCompressionFormat() != null)
            sb.append("CompressionFormat: ").append(getCompressionFormat()).append(",");
        if (getEncryptionConfiguration() != null)
            sb.append("EncryptionConfiguration: ").append(getEncryptionConfiguration()).append(",");
        if (getCloudWatchLoggingOptions() != null)
            sb.append("CloudWatchLoggingOptions: ").append(getCloudWatchLoggingOptions()).append(",");
        if (getProcessingConfiguration() != null)
            sb.append("ProcessingConfiguration: ").append(getProcessingConfiguration()).append(",");
        if (getS3BackupMode() != null)
            sb.append("S3BackupMode: ").append(getS3BackupMode()).append(",");
        if (getS3BackupUpdate() != null)
            sb.append("S3BackupUpdate: ").append(getS3BackupUpdate()).append(",");
        if (getDataFormatConversionConfiguration() != null)
            sb.append("DataFormatConversionConfiguration: ").append(getDataFormatConversionConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExtendedS3DestinationUpdate == false)
            return false;
        ExtendedS3DestinationUpdate other = (ExtendedS3DestinationUpdate) obj;
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        if (other.getBucketARN() == null ^ this.getBucketARN() == null)
            return false;
        if (other.getBucketARN() != null && other.getBucketARN().equals(this.getBucketARN()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        if (other.getBufferingHints() == null ^ this.getBufferingHints() == null)
            return false;
        if (other.getBufferingHints() != null && other.getBufferingHints().equals(this.getBufferingHints()) == false)
            return false;
        if (other.getCompressionFormat() == null ^ this.getCompressionFormat() == null)
            return false;
        if (other.getCompressionFormat() != null && other.getCompressionFormat().equals(this.getCompressionFormat()) == false)
            return false;
        if (other.getEncryptionConfiguration() == null ^ this.getEncryptionConfiguration() == null)
            return false;
        if (other.getEncryptionConfiguration() != null && other.getEncryptionConfiguration().equals(this.getEncryptionConfiguration()) == false)
            return false;
        if (other.getCloudWatchLoggingOptions() == null ^ this.getCloudWatchLoggingOptions() == null)
            return false;
        if (other.getCloudWatchLoggingOptions() != null && other.getCloudWatchLoggingOptions().equals(this.getCloudWatchLoggingOptions()) == false)
            return false;
        if (other.getProcessingConfiguration() == null ^ this.getProcessingConfiguration() == null)
            return false;
        if (other.getProcessingConfiguration() != null && other.getProcessingConfiguration().equals(this.getProcessingConfiguration()) == false)
            return false;
        if (other.getS3BackupMode() == null ^ this.getS3BackupMode() == null)
            return false;
        if (other.getS3BackupMode() != null && other.getS3BackupMode().equals(this.getS3BackupMode()) == false)
            return false;
        if (other.getS3BackupUpdate() == null ^ this.getS3BackupUpdate() == null)
            return false;
        if (other.getS3BackupUpdate() != null && other.getS3BackupUpdate().equals(this.getS3BackupUpdate()) == false)
            return false;
        if (other.getDataFormatConversionConfiguration() == null ^ this.getDataFormatConversionConfiguration() == null)
            return false;
        if (other.getDataFormatConversionConfiguration() != null
                && other.getDataFormatConversionConfiguration().equals(this.getDataFormatConversionConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        hashCode = prime * hashCode + ((getBucketARN() == null) ? 0 : getBucketARN().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        hashCode = prime * hashCode + ((getBufferingHints() == null) ? 0 : getBufferingHints().hashCode());
        hashCode = prime * hashCode + ((getCompressionFormat() == null) ? 0 : getCompressionFormat().hashCode());
        hashCode = prime * hashCode + ((getEncryptionConfiguration() == null) ? 0 : getEncryptionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchLoggingOptions() == null) ? 0 : getCloudWatchLoggingOptions().hashCode());
        hashCode = prime * hashCode + ((getProcessingConfiguration() == null) ? 0 : getProcessingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getS3BackupMode() == null) ? 0 : getS3BackupMode().hashCode());
        hashCode = prime * hashCode + ((getS3BackupUpdate() == null) ? 0 : getS3BackupUpdate().hashCode());
        hashCode = prime * hashCode + ((getDataFormatConversionConfiguration() == null) ? 0 : getDataFormatConversionConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public ExtendedS3DestinationUpdate clone() {
        try {
            return (ExtendedS3DestinationUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.ExtendedS3DestinationUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

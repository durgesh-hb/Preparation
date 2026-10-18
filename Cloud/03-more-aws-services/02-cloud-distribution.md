## CloudFront Distributions and Origins

<h3>What is a CloudFront Distribution?</h3>

> **Definition:** A distribution is the CloudFront configuration that defines how content is delivered to users.

It includes settings for caching, origins, HTTPS, and request handling

<h3>How It Works</h3>

```text
User's Browser
      |
      | HTTPS Request
      v
CloudFront Distribution
      |
      | Cache Miss
      v
Amazon S3 Bucket (Origin)
```

On a **cache hit**, CloudFront can serve the content without contacting S3.

<h3>Important Distribution Settings</h3>

| Setting | Purpose |
|---|---|
| Origin | Source of the original content |
| Cache Behavior | Defines caching and request-handling rules |
| Default Root Object | File served for the root path, commonly `index.html` |
| HTTPS Certificate | Enables HTTPS for visitors |
| Distribution Domain Name | CloudFront URL used to access content |

<h3> What is an Origin?</h3>

> **Definition:** An origin is the source from which CloudFront retrieves content when it cannot serve the requested content from its cache.

Examples:

- Amazon S3 bucket
- EC2-hosted web server
- Application Load Balancer (ALB)
- Other supported web servers

For our static website project, the origin will be an **Amazon S3 bucket**.

<h3> S3 Website Endpoint vs S3 Bucket Origin</h3>

CloudFront can connect to S3 in two different ways.

| Feature | S3 Website Endpoint | S3 Bucket (REST) Origin |
|---|---|---|
| Purpose | Uses S3 static website hosting | Retrieves objects directly from the bucket |
| Private bucket with OAC | Not supported | Supported |
| HTTPS from CloudFront to visitors | Yes | Yes |
| HTTPS between CloudFront and S3 | Website endpoint supports HTTP only | Supported |
| S3 website-specific index/error behavior | Supported by S3 website hosting | Configure equivalent behavior in CloudFront as needed |
| Suitable for a private S3 bucket | No, not with OAC | Yes |

**Important:** An S3 website endpoint is treated as a custom origin. It does not support Origin Access Control (OAC).

<h3> What is Origin Access Control (OAC)?</h3>

> **Definition:** OAC allows CloudFront to securely access a private S3 bucket without making its objects publicly readable.

<h3>How OAC Works</h3>

```text
User
 |
 | HTTPS
 v
CloudFront Distribution
 |
 | Authorized request
 v
Private S3 Bucket
```

Basic setup:

1. Create an S3 bucket and upload website files.
2. Create a CloudFront distribution with the S3 bucket as the origin.
3. Configure Origin Access Control (OAC).
4. Allow the specific CloudFront distribution to access the bucket using an S3 bucket policy.
5. Keep public access blocked on the bucket.
6. Access the website through the CloudFront distribution domain name.


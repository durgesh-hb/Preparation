## Amazon CloudFront (CDN)

Amazon CloudFront is an AWS **Content Delivery Network (CDN)** that delivers content to users from locations closer to them, reducing latency.

<h3>What is a CDN?</h3>

> **Definition:** A CDN is a network of distributed servers that caches and delivers content closer to users.

Simply:

> **CDN = Deliver content faster by caching it near users.**

<h3>How CloudFront Works</h3>

```text
                  Amazon S3
                   (Origin)
                      │
                      ▼
               Amazon CloudFront
                (Edge Locations)
                 /           \
                ▼             ▼
           User in India   User in USA
```

Example:

If your website files are stored in an S3 bucket in the US, CloudFront can cache them at edge locations closer to users in India.

Subsequent requests can be served from the cache instead of fetching the files from S3 every time.

<h3>Why Do We Need CloudFront?</h3>

- **Low Latency:** Delivers cached content faster.
- **Reduced Origin Requests:** Reduces repeated requests to S3.
- **HTTPS Support:** Enables secure content delivery.
- **Global Delivery:** Serves users around the world.
- **Private S3 Integration:** Supports Origin Access Control (OAC).

<h2>CloudFront Terminology</h2>

| Term | Meaning |
|------|---------|
| Distribution | Configuration that defines how CloudFront delivers content |
| Origin | Source of the original content, such as an S3 bucket |
| Edge Location | Location where CloudFront can cache and serve content |
| Cache Hit | Requested content is available in the cache |
| Cache Miss | CloudFront needs to retrieve content from the origin |
| TTL | Time content can remain cached, subject to cache settings |
| Invalidation | Request to remove specified objects from CloudFront caches |

<h2>Cache Hit vs Cache Miss</h2>

<h3>Cache Hit</h3>

> The requested content is available in the CloudFront cache.

```text
User
  │
  ▼
CloudFront Cache
  │
  ▼
Content Delivered
```

CloudFront serves the cached content without contacting the origin for that request.

<h3>Cache Miss</h3>

> The requested content is not available in the cache, so CloudFront retrieves it from the origin when possible.

```text
User
  │
  ▼
CloudFront Cache
  │
  ▼
Cache Miss
  │
  ▼
Amazon S3 (Origin)
  │
  ▼
Content Delivered
```

CloudFront may cache the retrieved content according to its cache configuration.

<h3>What Happens When S3 Content Changes?</h3>

Suppose you update `style.css` in your S3 bucket.

CloudFront might still serve the older cached version until the cached object expires or is invalidated.

You can manage this using:

- **TTL:** Controls how long content can remain cached.
- **Invalidation:** Requests removal of cached objects so updated content can be fetched when needed.
- **Versioned File Names:** For example, `style-v2.css`.


<h2>Key Takeaways</h2>

- **CloudFront = AWS Content Delivery Network (CDN).**
- **Origin** is the source of the original content.
- **Edge Locations** help deliver content closer to users.
- **Cache Hit** means content is available in the cache.
- **Cache Miss** means CloudFront needs to retrieve content from the origin.
- **TTL** controls how long content can remain cached.
- **Invalidation** requests removal of cached objects.
- CloudFront can work with S3 to deliver website files globally.
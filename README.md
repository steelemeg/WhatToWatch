# Android Project 4 - What To Watch

Submitted by: Megan Steele

What To Watch is a television browsing app that allows users to browse trendy shows.

Time spent: 12 hours spent in total

## Required Features

The following **required** functionality is completed:

- [X] **Choose any endpoint on The MovieDB API except `now_playing`**
  - Chosen Endpoint: `https://api.themoviedb.org/3/tv/popular`
- [X] **Make a request to your chosen endpoint and implement a RecyclerView to display all entries**
- [X] **Use Glide to load and display at least one image per entry**
- [X] **Click on an entry to view specific details about that entry using Intents**
	- Specific details include extra information on show rating, first air date, and show overview

The following **optional** features are implemented:

- [ ] **Add another API call and RecyclerView that lets the user interact with different data.** 
- [X] **Add rounded corners to the images using the Glide transformations**
- [ ] **Implement a shared element transition when user clicks into the details of a movie**

## Video Walkthrough

Here's a walkthrough of implemented user stories:

<img src='showDemo.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />

GIF created with [LiceCap](http://www.cockos.com/licecap/)

## Notes

Severe issues with API latencies (upwards of 90 seconds for the initial call) made development a challenge. 

## License

    Copyright 2022 Megan Steele

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
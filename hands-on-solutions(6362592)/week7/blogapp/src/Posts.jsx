import React, { Component } from 'react';

class Posts extends Component {
    constructor(props) {
        super(props);
        this.state = {
            posts: [],
            hasError: false,
        };
    }

    componentDidMount() {
        this.loadPosts();
    }

   loadPosts = () => {
    const data = [
        {
            id: 1,
            title: "React Lifecycle",
            body: "Learn about mounting, updating, and unmounting phases in React components."
        },
        {
            id: 2,
            title: "ComponentDidMount Explained",
            body: "This hook is called after the component is mounted and ready. Use it for API calls or initial setup."
        },
        {
            id: 3,
            title: "Understanding componentDidCatch",
            body: "Use this lifecycle method to catch errors in child components and display fallback UI."
        },
        {
            id: 4,
            title: "Why Use Class Components?",
            body: "Class components are useful when you need access to lifecycle methods and more structured logic."
        },
        {
            id: 5,
            title: "Best Practices in React",
            body: "Keep components small and focused, lift state up when necessary, and use props wisely."
        }
    ];
    this.setState({ posts: data });
};


    componentDidCatch(error, info) {
        alert('An error occurred while rendering Posts component.');
        console.error('Caught error:', error, info);
    }

    render() {
        const { posts } = this.state;

        return (
            <div>
                <h1>Posts</h1>
                {posts.map((post) => (
                    <div key={post.id}>
                        <h3>{post.title}</h3>
                        <p>{post.body}</p>
                        <hr />
                    </div>
                ))}
            </div>
        );
    }
}

export default Posts;

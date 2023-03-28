import React from 'react'
import ImageComponent from '.';
import { ComponentMeta, ComponentStory } from '@storybook/react'

export default {
    title: 'atoms/Image',
    component: ImageComponent,
} as ComponentMeta<typeof ImageComponent>;

const Template: ComponentStory<typeof ImageComponent> = (args) => (
    <ImageComponent {...args} />
);

export const image = Template.bind({});
image.args = {
    src: 'https://www.w3schools.com/html/img_girl.jpg',
    alt: 'Image not found',
    width: "20%",
    height: "20%",
}

